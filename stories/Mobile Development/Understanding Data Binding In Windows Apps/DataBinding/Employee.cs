using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataBinding
{
    public class Employee
    {
        public int id { get; set; }
        public string name { get; set; }
        public double salary { get; set; }

        public Employee(int _id, string _name, double _salary)
        {
            id = _id;
            name = _name;
            salary = _salary;
        }
    }
}
